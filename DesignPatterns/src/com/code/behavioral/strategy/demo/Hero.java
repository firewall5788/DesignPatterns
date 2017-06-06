package com.code.behavioral.strategy.demo;

/**
 * Ӣ����
 */
public class Hero {
	
	// ���ܹ����ӿ�����
	private Skill skill;
	// Ӣ������
	private String name;
	
	Hero(String name) {
		this.name = name;
	}
	
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	// ����
	public void R() {
		System.out.println("����" + name);
		// ���ù����ӿ� �ͷż���
		skill.dischargeSkill();
	}
}
