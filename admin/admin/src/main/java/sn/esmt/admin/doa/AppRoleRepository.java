package sn.esmt.admin.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sn.esmt.admin.entities.AppRoleEntity;
@Repository
public interface AppRoleRepository extends JpaRepository <AppRoleEntity, Integer> {
    AppRoleEntity findById(int id);

}
