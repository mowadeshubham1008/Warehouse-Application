package in.nit.shubham.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="shipment_type_tab")
public class ShipmentType {
	
	@Id
	@GeneratedValue
	@Column(name="shipment_id")
	private Integer shipId;
	@Column(name="shipment_mode")
	private String shipMode;
	@Column(name="shipment_code")
	private String shipCode;
	@Column(name="enable_shipment")
	private String enbleShip;
	@Column(name="shipment_grade")
	private String shipGrade;
	@Column(name="shipment_desc")
	private String shipDesc;

}
