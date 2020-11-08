package org.foo
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def checkOutFrom(repo) {
    git url: "git@github.com:sarathp12/${repo}"
  }

}