.class Ld1/q1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/q1;->U(Ld1/k3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ld1/q1;


# direct methods
.method constructor <init>(Ld1/q1;)V
    .locals 0

    iput-object p1, p0, Ld1/q1$f;->n:Ld1/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ld1/q1$f;->n:Ld1/q1;

    invoke-static {v0}, Ld1/q1;->m(Ld1/q1;)V

    return-void
.end method
