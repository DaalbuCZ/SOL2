.class public final synthetic Lx1/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lx1/x0;

.field public final synthetic o:Lx1/j1$e;


# direct methods
.method public synthetic constructor <init>(Lx1/x0;Lx1/j1$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/z;->n:Lx1/x0;

    iput-object p2, p0, Lx1/z;->o:Lx1/j1$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx1/z;->n:Lx1/x0;

    iget-object v1, p0, Lx1/z;->o:Lx1/j1$e;

    invoke-static {v0, v1}, Lx1/x0;->k0(Lx1/x0;Lx1/j1$e;)V

    return-void
.end method
