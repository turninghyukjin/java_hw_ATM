/**
 * AccountRepositoryAble account 관련 method
 */

import java.util.List;
import java.util.Optional;

public interface AccountRepositoryAble {
    /**
     * account 객체 추가
     * @param atmAccountDTO
     * @return
     */
    AtmAccountDTO insert(AtmAccountDTO atmAccountDTO);

    /**
     * id로 찾아서 account 객체 return
     * @param id
     * @return
     */
    Optional<AtmAccountDTO> selectByID(String id);

    /**
     * 모든 account 를 return
     * @return
     */
    List<AtmAccountDTO> selectAll();

    /**
     * account 객체 update
     * @param atmAccountDTO
     * @return
     */
    AtmAccountDTO update(AtmAccountDTO atmAccountDTO);

    /**
     * account 객체 delete
     * @param id
     * @return
     */
    Void delete(String id);
}
