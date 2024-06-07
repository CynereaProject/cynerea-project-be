package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Group;
import it.cynerea.project.be.model.dao.IpAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpAddressRepository extends JpaRepository<IpAddress, String> {
}
