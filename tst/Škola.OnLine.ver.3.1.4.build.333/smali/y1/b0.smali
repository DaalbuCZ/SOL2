.class public final synthetic Ly1/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/b0;->a:Ly1/c$a;

    iput-object p2, p0, Ly1/b0;->b:Ljava/lang/Object;

    iput-wide p3, p0, Ly1/b0;->c:J

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ly1/b0;->a:Ly1/c$a;

    iget-object v1, p0, Ly1/b0;->b:Ljava/lang/Object;

    iget-wide v2, p0, Ly1/b0;->c:J

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, v3, p1}, Ly1/o1;->w1(Ly1/c$a;Ljava/lang/Object;JLy1/c;)V

    return-void
.end method
