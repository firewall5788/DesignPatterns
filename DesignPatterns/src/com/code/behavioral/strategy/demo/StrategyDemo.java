package com.code.behavioral.strategy.demo;

public class StrategyDemo {
	
	public static void main(String[] args) {
		
		Hero guanghui = new Hero("���");
		Hero shitou = new Hero("���Ҿ���");
		
		// Ϊ��ͬӢ�����ò�ͬ����
		guanghui.setSkill(new SkillHuiMieSheJi());
		shitou.setSkill(new SkillYeManChongZhuang());
		
		// �ͷŴ���
		guanghui.R();
		shitou.R();
	}
}
