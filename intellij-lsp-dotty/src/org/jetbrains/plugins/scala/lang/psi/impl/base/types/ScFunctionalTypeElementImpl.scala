package org.jetbrains.plugins.scala.lang.psi.impl.base.types

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElementVisitor
import org.jetbrains.plugins.scala.lang.psi.ScalaPsiElementImpl
import org.jetbrains.plugins.scala.lang.psi.api.ScalaElementVisitor
import org.jetbrains.plugins.scala.lang.psi.api.base.types._

/**
 * @author ilyas, Alexander Podkhalyuzin
 */

class ScFunctionalTypeElementImpl(node: ASTNode) extends ScalaPsiElementImpl(node) with ScFunctionalTypeElement {
  override def accept(visitor: ScalaElementVisitor) {
    visitor.visitFunctionalTypeElement(this)
  }

  override def accept(visitor: PsiElementVisitor) {
    visitor match {
      case s: ScalaElementVisitor => s.visitFunctionalTypeElement(this)
      case _ => super.accept(visitor)
    }
  }
}