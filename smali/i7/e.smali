.class public final Li7/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf7/x;


# instance fields
.field private final n:Lh7/c;


# direct methods
.method public constructor <init>(Lh7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/e;->n:Lh7/c;

    return-void
.end method


# virtual methods
.method a(Lh7/c;Lf7/e;Lm7/a;Lg7/b;)Lf7/w;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh7/c;",
            "Lf7/e;",
            "Lm7/a<",
            "*>;",
            "Lg7/b;",
            ")",
            "Lf7/w<",
            "*>;"
        }
    .end annotation

    invoke-interface {p4}, Lg7/b;->value()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lm7/a;->a(Ljava/lang/Class;)Lm7/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lh7/c;->a(Lm7/a;)Lh7/i;

    move-result-object p1

    invoke-interface {p1}, Lh7/i;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lf7/w;

    if-eqz v0, :cond_0

    check-cast p1, Lf7/w;

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lf7/x;

    if-eqz v0, :cond_1

    check-cast p1, Lf7/x;

    invoke-interface {p1, p2, p3}, Lf7/x;->create(Lf7/e;Lm7/a;)Lf7/w;

    move-result-object p1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lf7/r;

    if-nez v0, :cond_3

    instance-of v1, p1, Lf7/j;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid attempt to bind an instance of "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lm7/a;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lf7/r;

    move-object v3, v0

    goto :goto_1

    :cond_4
    move-object v3, v1

    :goto_1
    instance-of v0, p1, Lf7/j;

    if-eqz v0, :cond_5

    move-object v1, p1

    check-cast v1, Lf7/j;

    :cond_5
    move-object v4, v1

    new-instance p1, Li7/l;

    const/4 v7, 0x0

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Li7/l;-><init>(Lf7/r;Lf7/j;Lf7/e;Lm7/a;Lf7/x;)V

    :goto_2
    if-eqz p1, :cond_6

    invoke-interface {p4}, Lg7/b;->nullSafe()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lf7/w;->b()Lf7/w;

    move-result-object p1

    :cond_6
    return-object p1
.end method

.method public create(Lf7/e;Lm7/a;)Lf7/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lf7/e;",
            "Lm7/a<",
            "TT;>;)",
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lm7/a;->c()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lg7/b;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lg7/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Li7/e;->n:Lh7/c;

    invoke-virtual {p0, v1, p1, p2, v0}, Li7/e;->a(Lh7/c;Lf7/e;Lm7/a;Lg7/b;)Lf7/w;

    move-result-object p1

    return-object p1
.end method
