package com.example.boot.config.model;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class TeamTest {
    @Resource
    private Team team;
    @Test
    void testTeam1() {
        log.info("team: {}", team);
        // 测试leader是否为lyf
        assertEquals("lyf", team.getLeader());

        // 测试手机号格式是否正确
        assertEquals(team.getPhone().matches("^[0-9]{11}$"), true);

        // 测试年龄是否在1-5之间
        assertEquals(team.getAge() >= 1 && team.getAge() <= 5, true);

        // 测试创建时间是否早于当前时间
        assertEquals(team.getCreateDate().isBefore(LocalDate.now()), true);
    }

    @Test
    void textTeam2() {
        assertEquals("lyf11", team.getLeader());
    }
}