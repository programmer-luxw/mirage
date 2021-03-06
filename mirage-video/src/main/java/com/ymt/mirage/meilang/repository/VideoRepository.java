/**
 * 
 */
package com.ymt.mirage.meilang.repository;

import org.springframework.stereotype.Repository;

import com.ymt.mirage.meilang.domain.Video;
import com.ymt.pz365.data.jpa.repository.PzRepository;

/**
 * @author zhailiang
 * @since 2016年5月15日
 */
@Repository
public interface VideoRepository extends PzRepository<Video> {

}
