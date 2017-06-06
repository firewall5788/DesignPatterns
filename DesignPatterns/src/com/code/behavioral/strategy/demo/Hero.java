package com.code.behavioral.strategy.demo;

/**
 * 英雄类
 */
public class Hero {
	
	// 技能公共接口引用
	private Skill skill;
	// 英雄名称
	private String name;
	
	Hero(String name) {
		this.name = name;
	}
	
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	// 大招
	public void R() {
		System.out.println("我是" + name);
		// 调用公共接口 释放技能
		skill.dischargeSkill();
	}
}
