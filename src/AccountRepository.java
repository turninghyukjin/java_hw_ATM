/**
 * account 관련 method 구현
 */

import java.util.*;

public class AccountRepository implements AccountRepositoryAble {
    /**
     * Hashmap (key, value)로 (number, AtmAccountDTO) 설정위해 사용
     * key 중복 안되고, 동일 key 가 들어오면 value 변경됨, null 값 저장 가능
     */
    private static Map<Long, AtmAccountDTO> account = new HashMap<>();
    /**
     * account 를 insert 할 때, 숫자 증가(insert 되는 객체에 번호(number)를 부여), 숙제는 db 사용 안하기에 사용
     */
    private static long number = 0L;

    /**
     * insert 될 때 마다 number 1씩 증가, atmAccountDTO 객체 insert
     *
     * @param atmAccountDTO
     * @return
     */
    @Override
    public AtmAccountDTO insert(AtmAccountDTO atmAccountDTO) {
        account.put(++number, atmAccountDTO);
        return atmAccountDTO;
    }

    /**
     * id로 검색
     * @param id 로 account 라는 HashMap 에서 get(id)로 맵 가져오고,
     *           Optional.ofNullable 는 가져온 값을 Optional 객체로 만들고 반환
     *          만약 null 값이 들어오면, Optional.empty()를 반환
     * @return
     */
    @Override
    public Optional<AtmAccountDTO> selectByID(String id) {
        return Optional.ofNullable(account.get(id));
    }

    /**
     * 전체 id(계좌) 검색 / 전체 id(계좌) 갯수 확인
     * @return
     */
    @Override
    public List<AtmAccountDTO> selectAll() {
        return new ArrayList<>(account.values());
    }

    /**
     * account pw 변경
     * @param atmAccountDTO
     * @return
     */
    @Override
    public AtmAccountDTO update(AtmAccountDTO atmAccountDTO) {
//        account.
        return atmAccountDTO;
    }

    /**
     * account 삭제
     * @param id
     * @return
     */
    @Override
    public Void delete(String id) {
//        String idDelete = selectByID(String id);
        return null;
    }
}
