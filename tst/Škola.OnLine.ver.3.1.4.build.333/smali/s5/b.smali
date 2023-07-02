.class public final synthetic Ls5/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln6/a$a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Lx5/d0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLx5/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls5/b;->a:Ljava/lang/String;

    iput-object p2, p0, Ls5/b;->b:Ljava/lang/String;

    iput-wide p3, p0, Ls5/b;->c:J

    iput-object p5, p0, Ls5/b;->d:Lx5/d0;

    return-void
.end method


# virtual methods
.method public final a(Ln6/b;)V
    .locals 6

    iget-object v0, p0, Ls5/b;->a:Ljava/lang/String;

    iget-object v1, p0, Ls5/b;->b:Ljava/lang/String;

    iget-wide v2, p0, Ls5/b;->c:J

    iget-object v4, p0, Ls5/b;->d:Lx5/d0;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ls5/d;->f(Ljava/lang/String;Ljava/lang/String;JLx5/d0;Ln6/b;)V

    return-void
.end method
