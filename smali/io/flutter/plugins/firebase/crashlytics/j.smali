.class public final synthetic Lio/flutter/plugins/firebase/crashlytics/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/Map;

.field public final synthetic o:Lt4/j;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/crashlytics/j;->n:Ljava/util/Map;

    iput-object p2, p0, Lio/flutter/plugins/firebase/crashlytics/j;->o:Lt4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/crashlytics/j;->n:Ljava/util/Map;

    iget-object v1, p0, Lio/flutter/plugins/firebase/crashlytics/j;->o:Lt4/j;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/crashlytics/n;->d(Ljava/util/Map;Lt4/j;)V

    return-void
.end method
