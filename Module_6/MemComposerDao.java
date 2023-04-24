package Module_6;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao{

    private List<Composer> composers = new ArrayList<>();

    public MemComposerDao() {
        Composer c1 = new Composer(1,"first","scf-fi");
        Composer c2 = new Composer(2,"second","action");
        Composer c3 = new Composer(3,"third","scf-fi");
        Composer c4 = new Composer(4,"fourth","romance");
        Composer c5 = new Composer(5,"fifth","thriller");
        composers.add(c1);
        composers.add(c2);
        composers.add(c3);
        composers.add(c4);
        composers.add(c5);
    }

    public List<Composer> findAll() {
        return composers;
    }

    public Composer findBy(Integer id) {
        Composer c = new Composer();
        for(Composer comp : composers) {
            if (comp.getId() == id) {
                c.setId(comp.getId());
                c.setGenre(comp.getGenre());
                c.setName(comp.getName());
            }
        }
        return c;
    }

    public void insert(Composer c) {
        Composer cnew = new Composer(c.getId(),c.getName(),c.getGenre());
        composers.add(cnew);
    }
}
