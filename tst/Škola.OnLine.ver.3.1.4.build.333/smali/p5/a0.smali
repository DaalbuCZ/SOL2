.class public final synthetic Lp5/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln6/a$a;


# instance fields
.field public final synthetic a:Ln6/a$a;

.field public final synthetic b:Ln6/a$a;


# direct methods
.method public synthetic constructor <init>(Ln6/a$a;Ln6/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/a0;->a:Ln6/a$a;

    iput-object p2, p0, Lp5/a0;->b:Ln6/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ln6/b;)V
    .locals 2

    iget-object v0, p0, Lp5/a0;->a:Ln6/a$a;

    iget-object v1, p0, Lp5/a0;->b:Ln6/a$a;

    invoke-static {v0, v1, p1}, Lp5/d0;->d(Ln6/a$a;Ln6/a$a;Ln6/b;)V

    return-void
.end method
