.class public final synthetic Ly1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/l;->a:Ly1/c$a;

    iput p2, p0, Ly1/l;->b:I

    iput-wide p3, p0, Ly1/l;->c:J

    iput-wide p5, p0, Ly1/l;->d:J

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Ly1/l;->a:Ly1/c$a;

    iget v1, p0, Ly1/l;->b:I

    iget-wide v2, p0, Ly1/l;->c:J

    iget-wide v4, p0, Ly1/l;->d:J

    move-object v6, p1

    check-cast v6, Ly1/c;

    invoke-static/range {v0 .. v6}, Ly1/o1;->e1(Ly1/c$a;IJJLy1/c;)V

    return-void
.end method
