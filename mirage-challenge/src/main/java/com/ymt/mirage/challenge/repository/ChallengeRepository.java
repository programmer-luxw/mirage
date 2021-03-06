/**
 * 
 */
package com.ymt.mirage.challenge.repository;

import org.springframework.stereotype.Repository;

import com.ymt.mirage.challenge.domain.Challenge;
import com.ymt.pz365.data.jpa.repository.PzRepository;

/**
 * @author zhailiang
 * @since 2016年5月10日
 */
@Repository
public interface ChallengeRepository extends PzRepository<Challenge> {

}
