.class public final synthetic Lio/flutter/plugins/firebase/crashlytics/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lio/flutter/plugins/firebase/crashlytics/n;

.field public final synthetic o:Lt4/j;

.field public final synthetic p:Lf5/e;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/crashlytics/n;Lt4/j;Lf5/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/crashlytics/h;->n:Lio/flutter/plugins/firebase/crashlytics/n;

    iput-object p2, p0, Lio/flutter/plugins/firebase/crashlytics/h;->o:Lt4/j;

    iput-object p3, p0, Lio/flutter/plugins/firebase/crashlytics/h;->p:Lf5/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/crashlytics/h;->n:Lio/flutter/plugins/firebase/crashlytics/n;

    iget-object v1, p0, Lio/flutter/plugins/firebase/crashlytics/h;->o:Lt4/j;

    iget-object v2, p0, Lio/flutter/plugins/firebase/crashlytics/h;->p:Lf5/e;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/crashlytics/n;->l(Lio/flutter/plugins/firebase/crashlytics/n;Lt4/j;Lf5/e;)V

    return-void
.end method
