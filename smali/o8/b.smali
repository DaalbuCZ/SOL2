.class public final synthetic Lo8/b;
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

    iput-object p1, p0, Lo8/b;->n:Lt4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lo8/b;->n:Lt4/j;

    invoke-static {v0}, Lo8/m;->k(Lt4/j;)V

    return-void
.end method
