.class public final synthetic Lt1/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/b0;->a:Lt1/c$a;

    iput-object p2, p0, Lt1/b0;->b:Ljava/lang/String;

    iput-wide p3, p0, Lt1/b0;->c:J

    iput-wide p5, p0, Lt1/b0;->d:J

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lt1/b0;->a:Lt1/c$a;

    iget-object v1, p0, Lt1/b0;->b:Ljava/lang/String;

    iget-wide v2, p0, Lt1/b0;->c:J

    iget-wide v4, p0, Lt1/b0;->d:J

    move-object v6, p1

    check-cast v6, Lt1/c;

    invoke-static/range {v0 .. v6}, Lt1/o1;->z1(Lt1/c$a;Ljava/lang/String;JJLt1/c;)V

    return-void
.end method
