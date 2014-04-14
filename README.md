# scalatra-template

## Overview

This is my template for [Scalatra](http://www.scalatra.org/).  Since I always spend way too much time getting back to this point (and I don't do it often enough to remember the key points), I'm saving a template.  Some key differences with other templates I've come across when I last searched for enough details to replicate this:

* This uses build.sbt, not Build.scala.  I tend to reserve creating a project using the Scala syntax for cases where things get complex.  If I'm doing something simple, I prefer build.sbt
* I've strived to make this as minimal as I can.  I'd like to fiddle with different view libraries at some point, so keeping that out of here.
* This is independent of giter8.  I don't have anything against that project or the template it generates, but it has a bit more than I sometimes want and I personally like having a minimal example build.sbt to start from.  The simpler the better.

## Key files

Whenever I mess around with this for way too long, it's invariably because I've forgotten something outside build.sbt, but I'm fighting to get build.sbt to work.  Thus, the key elements (in my limited understanding) are:

* You need main/webapp/WEB-INF/web.xml.  I always seem to forget this when setting up a scalatra project, even though I never forget it when setting up a new web app using traditional Java methods.  Who knows why.
* To get everything properly configured, you need the scalatra-sbt plugin.  Otherwise, your build.sbt won't compile or you won't be able to start the jetty console

Other interesting bits I've put in here:

* I'm using the [sbt runner](https://github.com/paulp/sbt-extras) from Paul Phillips here.  Not having to worry about whether I've installed sbt on the machine I'm working on or which version is installed is fantastic.
* I've also included the jetty container.  I've never seen a Scalatra project without it, and I'd never imagine doing one without it, so including it in a "minimal" configuration.
