.class public final synthetic Lz1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz1/t$a;

.field public final synthetic o:I

.field public final synthetic p:J

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Lz1/t$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/j;->n:Lz1/t$a;

    iput p2, p0, Lz1/j;->o:I

    iput-wide p3, p0, Lz1/j;->p:J

    iput-wide p5, p0, Lz1/j;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lz1/j;->n:Lz1/t$a;

    iget v1, p0, Lz1/j;->o:I

    iget-wide v2, p0, Lz1/j;->p:J

    iget-wide v4, p0, Lz1/j;->q:J

    invoke-static/range {v0 .. v5}, Lz1/t$a;->i(Lz1/t$a;IJJ)V

    return-void
.end method
