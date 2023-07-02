.class public final synthetic Lz1/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz1/t$a;

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(Lz1/t$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/k;->n:Lz1/t$a;

    iput-wide p2, p0, Lz1/k;->o:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz1/k;->n:Lz1/t$a;

    iget-wide v1, p0, Lz1/k;->o:J

    invoke-static {v0, v1, v2}, Lz1/t$a;->h(Lz1/t$a;J)V

    return-void
.end method
