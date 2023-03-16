.class public final synthetic Lq3/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lq3/x$a;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:J

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/s;->n:Lq3/x$a;

    iput-object p2, p0, Lq3/s;->o:Ljava/lang/String;

    iput-wide p3, p0, Lq3/s;->p:J

    iput-wide p5, p0, Lq3/s;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lq3/s;->n:Lq3/x$a;

    iget-object v1, p0, Lq3/s;->o:Ljava/lang/String;

    iget-wide v2, p0, Lq3/s;->p:J

    iget-wide v4, p0, Lq3/s;->q:J

    invoke-static/range {v0 .. v5}, Lq3/x$a;->g(Lq3/x$a;Ljava/lang/String;JJ)V

    return-void
.end method
