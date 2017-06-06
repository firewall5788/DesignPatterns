package com.code.behavioral.strategy.demo;

public class StrategyDemo {
	
	public static void main(String[] args) {
		
		Hero guanghui = new Hero("光辉");
		Hero shitou = new Hero("熔岩巨兽");
		
		// 为不同英雄设置不同技能
		guanghui.setSkill(new SkillHuiMieSheJi());
		shitou.setSkill(new SkillYeManChongZhuang());
		
		// 释放大招
		guanghui.R();
		shitou.R();
	}
}
