.class public final synthetic Lt1/h1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/h1;->a:Lt1/c$a;

    iput-boolean p2, p0, Lt1/h1;->b:Z

    iput p3, p0, Lt1/h1;->c:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt1/h1;->a:Lt1/c$a;

    iget-boolean v1, p0, Lt1/h1;->b:Z

    iget v2, p0, Lt1/h1;->c:I

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, v2, p1}, Lt1/o1;->l1(Lt1/c$a;ZILt1/c;)V

    return-void
.end method
