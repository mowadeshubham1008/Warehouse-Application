package in.nit.shubham.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.shubham.model.ShipmentType;

public interface ShipmentTypeRepository extends JpaRepository<ShipmentType, Integer> {

}
