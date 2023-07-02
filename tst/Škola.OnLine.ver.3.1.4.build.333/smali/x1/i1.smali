.class public final synthetic Lx1/i1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lx1/j1;

.field public final synthetic o:Lx1/g3;


# direct methods
.method public synthetic constructor <init>(Lx1/j1;Lx1/g3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/i1;->n:Lx1/j1;

    iput-object p2, p0, Lx1/i1;->o:Lx1/g3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx1/i1;->n:Lx1/j1;

    iget-object v1, p0, Lx1/i1;->o:Lx1/g3;

    invoke-static {v0, v1}, Lx1/j1;->g(Lx1/j1;Lx1/g3;)V

    return-void
.end method
