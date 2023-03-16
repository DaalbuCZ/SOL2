.class public final Le6/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le6/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Le6/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Le6/d$a;->n:Le6/d$a;

    iput-object v0, p0, Le6/a;->b:Le6/d$a;

    return-void
.end method

.method public static b()Le6/a;
    .locals 1

    new-instance v0, Le6/a;

    invoke-direct {v0}, Le6/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Le6/d;
    .locals 3

    new-instance v0, Le6/a$a;

    iget v1, p0, Le6/a;->a:I

    iget-object v2, p0, Le6/a;->b:Le6/d$a;

    invoke-direct {v0, v1, v2}, Le6/a$a;-><init>(ILe6/d$a;)V

    return-object v0
.end method

.method public c(I)Le6/a;
    .locals 0

    iput p1, p0, Le6/a;->a:I

    return-object p0
.end method
