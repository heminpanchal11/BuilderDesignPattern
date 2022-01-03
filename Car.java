package com.hemiverse.model;

import com.hemiverse.model.Car.CarBuilder;

public class Car {

	String modelName;
	int range;
	int modelYear;
	String engineType;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", range=" + range + ", modelYear=" + modelYear + ", engineType="
				+ engineType + "]";
	}

	private Car(CarBuilder carBuilder) {
		this.modelName = carBuilder.modelName;
		this.range = carBuilder.range;
		this.modelYear = carBuilder.modelYear;
		this.engineType = carBuilder.engineType;
	}

	public static class CarBuilder {

		String modelName;
		int range;
		int modelYear;
		String engineType;

		public CarBuilder modelName(String name_) {
			this.modelName = name_;
			return this;
		}

		public CarBuilder range(int range_) {
			this.range = range_;
			return this;
		}

		public CarBuilder year(int year_) {
			this.modelYear = year_;
			return this;
		}

		public CarBuilder engineType(String engine_) {
			this.engineType = engine_;
			return this;
		}

		public Car build() {
			Car car = new Car(this);
			return car;
		}

	}
	
	
	public static void main(String[] args) {

		CarBuilder builder = new CarBuilder();
		
		Car teslaCar=builder.modelName("TESLA MODEL 3").engineType("INDUCTION MOTOR").year(2010).range(150).build();
		
		System.out.println(teslaCar);

		Car fordCar=builder.modelName("FORD MODEL T").engineType("COMBUTION").year(1908).range(30).build();
		
		System.out.println(fordCar);
		
	}
}
