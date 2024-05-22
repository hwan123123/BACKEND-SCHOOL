package org.example.springmvc.controller;

import org.example.springmvc.domain.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/friends")
public class FriendController {

    private List<Friend> friends = new ArrayList<>();
    private Long counter = 1L;

    @ModelAttribute("friend")
    public Friend getFriend() {
        return new Friend();
    }

    @GetMapping
    public String listFriends(Model model) {
        model.addAttribute("friends", friends);
        return "friend-list";
    }

    @GetMapping("/new")
    public String showAddFriendForm() {
        return "add-friend";
    }

    @PostMapping
    public String addFriend(@ModelAttribute Friend friend) {
        friend.setId(counter++);
        friends.add(friend);
        return "redirect:/friends";
    }

    @GetMapping("/edit/{id}")
    public String showEditFriendForm(@PathVariable Long id, Model model) {
        Optional<Friend> friendOpt = friends.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst();

        if (friendOpt.isPresent()) {
            model.addAttribute("friend", friendOpt.get());
            return "edit-friend";
        } else {
            return "redirect:/friends";
        }
    }

    @PostMapping("/update/{id}")
    public String updateFriend(@PathVariable Long id, @ModelAttribute Friend friend) {
        friends.removeIf(f -> f.getId().equals(id));
        friend.setId(id);
        friends.add(friend);
        return "redirect:/friends";
    }
}
