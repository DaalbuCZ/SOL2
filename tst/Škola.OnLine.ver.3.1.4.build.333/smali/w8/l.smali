.class public final synthetic Lw8/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw8/m;

.field public final synthetic o:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Lw8/m;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/l;->n:Lw8/m;

    iput-object p2, p0, Lw8/l;->o:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw8/l;->n:Lw8/m;

    iget-object v1, p0, Lw8/l;->o:Ly4/j;

    invoke-static {v0, v1}, Lw8/m;->l(Lw8/m;Ly4/j;)V

    return-void
.end method
