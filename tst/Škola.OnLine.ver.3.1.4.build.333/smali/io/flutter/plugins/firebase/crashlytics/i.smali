.class public final synthetic Lio/flutter/plugins/firebase/crashlytics/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/Map;

.field public final synthetic o:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/crashlytics/i;->n:Ljava/util/Map;

    iput-object p2, p0, Lio/flutter/plugins/firebase/crashlytics/i;->o:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/crashlytics/i;->n:Ljava/util/Map;

    iget-object v1, p0, Lio/flutter/plugins/firebase/crashlytics/i;->o:Ly4/j;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/crashlytics/n;->b(Ljava/util/Map;Ly4/j;)V

    return-void
.end method
