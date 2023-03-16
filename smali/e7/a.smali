.class public final synthetic Le7/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk5/h;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lk5/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lk5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/a;->a:Ljava/lang/String;

    iput-object p2, p0, Le7/a;->b:Lk5/c;

    return-void
.end method


# virtual methods
.method public final a(Lk5/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le7/a;->a:Ljava/lang/String;

    iget-object v1, p0, Le7/a;->b:Lk5/c;

    invoke-static {v0, v1, p1}, Le7/b;->b(Ljava/lang/String;Lk5/c;Lk5/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
