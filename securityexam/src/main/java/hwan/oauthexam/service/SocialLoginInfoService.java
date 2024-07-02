package hwan.oauthexam.service;

import hwan.oauthexam.domain.SocialLogininfo;
import hwan.oauthexam.repository.SocialLoginInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocialLoginInfoService {
    private final SocialLoginInfoRepository socialLoginRepository;

    @Transactional(readOnly = false)
    public SocialLogininfo saveSocialLogininfo(String provider, String socialId) {
        SocialLogininfo socialLogininfo = new SocialLogininfo();
        socialLogininfo.setProvider(provider);
        socialLogininfo.setSocialId(socialId);

        return socialLoginRepository.save(socialLogininfo);
    }

    @Transactional(readOnly = true)
    public Optional<SocialLogininfo> findByProviderAndUuidAndSocialId(String provider, String uuid, String socialId) {
        return socialLoginRepository.findByProviderAndUuidAndSocialId(provider, uuid, socialId);
    }
}
