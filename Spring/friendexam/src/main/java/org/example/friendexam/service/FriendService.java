package org.example.friendexam.service;

import lombok.RequiredArgsConstructor;
import org.example.friendexam.domain.Friend;
import org.example.friendexam.repository.FriendRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;

    @Transactional(readOnly = true)
    public Iterable<Friend> findAllFriends() {
        return friendRepository.findAll();
    }

    // 친구등록
    @Transactional
    public Friend saveFriend(Friend friend) {
        return friendRepository.save(friend);
    }

    // id에 해당하는 친구 정보 조회
    @Transactional(readOnly = true)
    public Friend findFriendById(Long id) {
        return friendRepository.findById(id).orElse(null);
    }

    public void deleteFriendById(Long id) {
        friendRepository.deleteById(id);
    }

    public Page<Friend> findAllFriends(Pageable pageable) {
        Pageable sortedByDescId = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(),
                Sort.by(Sort.Direction.DESC, "id"));
        return friendRepository.findAll(sortedByDescId);
    }
}