.class final Ld4/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lw4/l;

.field final synthetic o:Ld4/z;


# direct methods
.method constructor <init>(Ld4/z;Lw4/l;)V
    .locals 0

    iput-object p1, p0, Ld4/x;->o:Ld4/z;

    iput-object p2, p0, Ld4/x;->n:Lw4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld4/x;->o:Ld4/z;

    iget-object v1, p0, Ld4/x;->n:Lw4/l;

    invoke-static {v0, v1}, Ld4/z;->o0(Ld4/z;Lw4/l;)V

    return-void
.end method
