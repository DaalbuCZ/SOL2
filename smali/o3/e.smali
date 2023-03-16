.class public final synthetic Lo3/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lo3/f$a$a$a;

.field public final synthetic o:I

.field public final synthetic p:J

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Lo3/f$a$a$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/e;->n:Lo3/f$a$a$a;

    iput p2, p0, Lo3/e;->o:I

    iput-wide p3, p0, Lo3/e;->p:J

    iput-wide p5, p0, Lo3/e;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lo3/e;->n:Lo3/f$a$a$a;

    iget v1, p0, Lo3/e;->o:I

    iget-wide v2, p0, Lo3/e;->p:J

    iget-wide v4, p0, Lo3/e;->q:J

    invoke-static/range {v0 .. v5}, Lo3/f$a$a;->a(Lo3/f$a$a$a;IJJ)V

    return-void
.end method
