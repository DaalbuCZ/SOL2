.class final Ly3/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lr4/l;

.field final synthetic o:Ly3/z;


# direct methods
.method constructor <init>(Ly3/z;Lr4/l;)V
    .locals 0

    iput-object p1, p0, Ly3/x;->o:Ly3/z;

    iput-object p2, p0, Ly3/x;->n:Lr4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly3/x;->o:Ly3/z;

    iget-object v1, p0, Ly3/x;->n:Lr4/l;

    invoke-static {v0, v1}, Ly3/z;->o0(Ly3/z;Lr4/l;)V

    return-void
.end method
