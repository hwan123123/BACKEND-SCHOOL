package hwan.oauthexam.repository;

import hwan.oauthexam.domain.SocialLoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SocialLoginInfoRepository extends JpaRepository<SocialLoginInfo, Long> {
    Optional<SocialLoginInfo> findByProviderAndUuidAndSocialId(String provider, String uuid, String socialId);
}
