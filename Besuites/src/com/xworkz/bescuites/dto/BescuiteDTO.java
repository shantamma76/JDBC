package com.xworkz.bescuites.dto;

public class BescuiteDTO {

	private int id;
	private String bescuite_Name;
	private double price;
	private String texture;
	private String shape;
	private String color;
	private String taste;
	private String manf_date;
	private String expire_date;
	private String flavour;

	public BescuiteDTO(int id, String bescuite_Name, double price, String texture, String shape, String color,
			String taste, String manf_date, String expire_date, String flavour) {
		super();
		this.id = id;
		this.bescuite_Name = bescuite_Name;
		this.price = price;
		this.texture = texture;
		this.shape = shape;
		this.color = color;
		this.taste = taste;
		this.manf_date = manf_date;
		this.expire_date = expire_date;
		this.flavour = flavour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBescuite_Name() {
		return bescuite_Name;
	}

	public void setBescuite_Name(String bescuite_Name) {
		this.bescuite_Name = bescuite_Name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getManf_date() {
		return manf_date;
	}

	public void setManf_date(String manf_date) {
		this.manf_date = manf_date;
	}

	public String getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(String expire_date) {
		this.expire_date = expire_date;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bescuite_Name == null) ? 0 : bescuite_Name.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((expire_date == null) ? 0 : expire_date.hashCode());
		result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
		result = prime * result + id;
		result = prime * result + ((manf_date == null) ? 0 : manf_date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((shape == null) ? 0 : shape.hashCode());
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
		result = prime * result + ((texture == null) ? 0 : texture.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BescuiteDTO other = (BescuiteDTO) obj;
		if (bescuite_Name == null) {
			if (other.bescuite_Name != null)
				return false;
		} else if (!bescuite_Name.equals(other.bescuite_Name))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (expire_date == null) {
			if (other.expire_date != null)
				return false;
		} else if (!expire_date.equals(other.expire_date))
			return false;
		if (flavour == null) {
			if (other.flavour != null)
				return false;
		} else if (!flavour.equals(other.flavour))
			return false;
		if (id != other.id)
			return false;
		if (manf_date == null) {
			if (other.manf_date != null)
				return false;
		} else if (!manf_date.equals(other.manf_date))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		if (taste == null) {
			if (other.taste != null)
				return false;
		} else if (!taste.equals(other.taste))
			return false;
		if (texture == null) {
			if (other.texture != null)
				return false;
		} else if (!texture.equals(other.texture))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BescuiteDTO [id=" + id + ", bescuite_Name=" + bescuite_Name + ", price=" + price + ", texture="
				+ texture + ", shape=" + shape + ", color=" + color + ", taste=" + taste + ", manf_date=" + manf_date
				+ ", expire_date=" + expire_date + ", flavour=" + flavour + "]";
	}
}
