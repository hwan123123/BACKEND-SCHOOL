package hwan.oauthexam.repository;

import hwan.oauthexam.domain.SocialLogininfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SocialLoginInfoRepository extends JpaRepository<SocialLogininfo, Long> {
    Optional<SocialLogininfo> findByProviderAndUuidAndSocialId(String provider, String uuid, String socialId);
}
