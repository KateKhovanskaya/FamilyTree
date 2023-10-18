package Model.fileHandler;
import java.io.Serializable;

import Model.familyTree.FamilyTree;
import Model.human.FamilyTreeObject;

public interface Savable {
    public boolean save(Serializable serializable, String path);
    public FamilyTree<FamilyTreeObject> load(String path);
}
