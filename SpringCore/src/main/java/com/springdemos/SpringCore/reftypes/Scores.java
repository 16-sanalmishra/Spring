package com.springdemos.SpringCore.reftypes;

public class Scores {
	@Override
	public String toString() {
		return "Scores [math=" + math + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	double math;
	double physics;
	double chemistry;
}
