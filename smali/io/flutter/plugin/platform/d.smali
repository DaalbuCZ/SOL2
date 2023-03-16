.class public final synthetic Lio/flutter/plugin/platform/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lio/flutter/plugin/platform/c$b;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/c$b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/d;->n:Lio/flutter/plugin/platform/c$b;

    iput p2, p0, Lio/flutter/plugin/platform/d;->o:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/d;->n:Lio/flutter/plugin/platform/c$b;

    iget v1, p0, Lio/flutter/plugin/platform/d;->o:I

    invoke-static {v0, v1}, Lio/flutter/plugin/platform/c$b;->a(Lio/flutter/plugin/platform/c$b;I)V

    return-void
.end method
