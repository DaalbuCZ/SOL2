.class Lq5/m$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/m;->k(Lx5/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lx5/i;

.field final synthetic o:Lq5/m;


# direct methods
.method constructor <init>(Lq5/m;Lx5/i;)V
    .locals 0

    iput-object p1, p0, Lq5/m$b;->o:Lq5/m;

    iput-object p2, p0, Lq5/m$b;->n:Lx5/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lq5/m$b;->o:Lq5/m;

    iget-object v1, p0, Lq5/m$b;->n:Lx5/i;

    invoke-static {v0, v1}, Lq5/m;->a(Lq5/m;Lx5/i;)Lt4/i;

    return-void
.end method
