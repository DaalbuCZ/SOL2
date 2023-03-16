.class public final synthetic Lu1/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu1/s$a;

.field public final synthetic o:I

.field public final synthetic p:J

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Lu1/s$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/i;->n:Lu1/s$a;

    iput p2, p0, Lu1/i;->o:I

    iput-wide p3, p0, Lu1/i;->p:J

    iput-wide p5, p0, Lu1/i;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lu1/i;->n:Lu1/s$a;

    iget v1, p0, Lu1/i;->o:I

    iget-wide v2, p0, Lu1/i;->p:J

    iget-wide v4, p0, Lu1/i;->q:J

    invoke-static/range {v0 .. v5}, Lu1/s$a;->i(Lu1/s$a;IJJ)V

    return-void
.end method
