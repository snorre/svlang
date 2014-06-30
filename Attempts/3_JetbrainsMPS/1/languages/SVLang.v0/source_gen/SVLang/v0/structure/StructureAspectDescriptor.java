package SVLang.v0.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("SVLang.v0.structure.CodeFile").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").children(new String[]{"namespace", "imports", "main", "funs"}, new boolean[]{false, true, false, true}).create();
      case 1:
        return new ConceptDescriptorBuilder("SVLang.v0.structure.Codeline").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("line").create();
      case 2:
        return new ConceptDescriptorBuilder("SVLang.v0.structure.Fun").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"lines"}, new boolean[]{true}).create();
      case 3:
        return new ConceptDescriptorBuilder("SVLang.v0.structure.Import").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("fqn").create();
      case 4:
        return new ConceptDescriptorBuilder("SVLang.v0.structure.Main").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").children(new String[]{"lines"}, new boolean[]{true}).create();
      case 5:
        return new ConceptDescriptorBuilder("SVLang.v0.structure.Namespace").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("fqn").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"SVLang.v0.structure.CodeFile", "SVLang.v0.structure.Codeline", "SVLang.v0.structure.Fun", "SVLang.v0.structure.Import", "SVLang.v0.structure.Main", "SVLang.v0.structure.Namespace"};
}
