.class public final synthetic Lo8/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lo8/m;

.field public final synthetic o:Lt4/j;


# direct methods
.method public synthetic constructor <init>(Lo8/m;Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo8/l;->n:Lo8/m;

    iput-object p2, p0, Lo8/l;->o:Lt4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo8/l;->n:Lo8/m;

    iget-object v1, p0, Lo8/l;->o:Lt4/j;

    invoke-static {v0, v1}, Lo8/m;->l(Lo8/m;Lt4/j;)V

    return-void
.end method
