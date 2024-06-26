package package04;

public class SuperItem {
	
	private int itemIndex;
	private String name;
	private String type;
	private int price;
	private int damageValue;
	private int armorValue;
	private String equipmentType;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public String determineItemType() {
		return this.getClass().getSimpleName();
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getItemIndex() {
		return itemIndex;
	}
	public void setItemIndex(int itemIndex) {
		this.itemIndex = itemIndex;
	}
	public int getDamageValue() {
		return damageValue;
	}
	public void setDamageValue(int damageValue) {
		this.damageValue = damageValue;
	}
	public int getArmorValue() {
		return armorValue;
	}
	public void setArmorValue(int armorValue) {
		this.armorValue = armorValue;
	}
	public String getEquipmentType() {
		return equipmentType;
	}
	public void setEquipmentType(String string) {
		this.equipmentType = string;
	}

}
