.class public final synthetic Lz1/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz1/t$a;

.field public final synthetic o:Z


# direct methods
.method public synthetic constructor <init>(Lz1/t$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/s;->n:Lz1/t$a;

    iput-boolean p2, p0, Lz1/s;->o:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/s;->n:Lz1/t$a;

    iget-boolean v1, p0, Lz1/s;->o:Z

    invoke-static {v0, v1}, Lz1/t$a;->a(Lz1/t$a;Z)V

    return-void
.end method
