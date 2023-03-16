.class public final synthetic Lp8/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lt4/j;


# direct methods
.method public synthetic constructor <init>(Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/g;->n:Lt4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp8/g;->n:Lt4/j;

    invoke-static {v0}, Lio/flutter/plugins/firebase/messaging/e;->b(Lt4/j;)V

    return-void
.end method
